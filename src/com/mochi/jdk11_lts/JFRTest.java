package com.mochi.jdk11_lts;

import jdk.jfr.Description;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class JFRTest {

    /**
     * -XX:StartFlightRecording=duration=1s, filename=recording.jfr
     */
    @Label("Hello World")
    @Description("Helps the programmer getting started")
    public static class FlightRecorderTest extends Event {
        @Label("Message")
        String message;
    }

    public static void readRecordFile() throws IOException {
        final Path path = Paths.get("/Users/gaodelu/1.jfr");
        final List<RecordedEvent> recordedEvents = RecordingFile.readAllEvents(path);
        for (RecordedEvent event : recordedEvents) {
            System.out.println(event.getStartTime());
        }
    }


    public static void main(String[] args) throws Exception {
        FlightRecorderTest event = new FlightRecorderTest();
        for (int i = 0; i < 10; i++) {
            event.message = "hello, world!";
            event.commit();
            System.out.println("commit!"+i);
        }
        readRecordFile();
    }
}
