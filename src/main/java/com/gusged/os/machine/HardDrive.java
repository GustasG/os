package com.gusged.os.machine;

import lombok.Getter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.FileNotFoundException;

@Getter
public class HardDrive implements Closeable {
    private static final Logger logger = LoggerFactory.getLogger(HardDrive.class);

    private final RandomAccessFile file;
    private final long sectorSize;
    private final long sectorCount;

    public HardDrive(String path, long sectorCount, long sectorSize) throws FileNotFoundException {
        try {
            file = new RandomAccessFile(path, "rw");
        } catch (FileNotFoundException e) {
            logger.error("File {} was not found. Check that file exists in launch directory", path);
            throw e;
        }

        this.sectorCount = sectorCount;
        this.sectorSize = sectorSize;
    }

    public void write(long sector, int[] data) {
        if (sector < 0 || sector >= sectorCount) {
            throw new IllegalArgumentException(String.format("Sector has to be between %d and %d", 0, sectorCount));
        }

        try {
            file.seek(sector * sectorSize);

            for (int value : data) {
                file.write(value);
            }
        } catch (IOException e) {
            logger.error("Failed to write to hard drive", e);
        }
    }

    public int[] read(long sector, int size) {
        if (sector < 0 || sector >= sectorCount) {
            throw new IllegalArgumentException(String.format("Sector has to be between %d and %d", 0, sectorCount));
        }

        var data = new int[size];

        try {
            file.seek(sector * sectorSize);

            for (int i = 0; i < size; i++) {
                data[i] = file.read();
            }
        } catch (IOException e) {
            logger.error("Failed to read from hard drive", e);
        }

        return data;
    }

    @Override
    public void close() throws IOException {
        file.close();
    }
}