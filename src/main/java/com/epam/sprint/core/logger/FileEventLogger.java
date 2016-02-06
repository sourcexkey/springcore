package com.epam.sprint.core.logger;

import com.epam.sprint.core.entity.Event;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Denys_Uzhvii
 */
public class FileEventLogger implements EventLogger {

    private String fileName;
    private File file;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    public void init() throws IOException {
        this.file = new File(this.fileName);
        if (file.canWrite()) {
            throw new IOException("file a now writable");
        }
    }

    public void logEvent(Event event) {
        try (DataOutputStream os = new DataOutputStream(new FileOutputStream(fileName, true))) {
            os.writeUTF(event.toString() + "\n");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
