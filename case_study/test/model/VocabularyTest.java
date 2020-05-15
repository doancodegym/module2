package model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VocabularyTest {
    Vocabulary vocabulary = new Vocabulary("cure","(n.)","thuốc, phương thuốc, cách chữa bệnh","http://audio.tflat.vn/audio/c/u/cure.mp3","The scientists are still studying a new cure for cancer.","Các nhà khoa học vẫn đang nghiên cứu một phương thuốc mới để chữa ung thư.");

    @Test
    void getName() {
        String result = "cure";
        assertEquals(vocabulary.getName(),result);
    }

    @Test
    void getExample() {
        String result = "The scientists are still studying a new cure for cancer.";
        assertEquals(vocabulary.getExample(),result);
    }

    @Test
    void getType() {
        String result = "(n.)";
        assertEquals(vocabulary.getType(),result);
    }

    @Test
    void getTranslate() {
        String result = "thuốc, phương thuốc, cách chữa bệnh";
        assertEquals(vocabulary.getTranslate(),result);
    }

    @Test
    void getLink() {
        String result = "http://audio.tflat.vn/audio/c/u/cure.mp3";
        assertEquals(vocabulary.getLink(),result);
    }

    @Test
    void getExampleVN() {
        String result = "Các nhà khoa học vẫn đang nghiên cứu một phương thuốc mới để chữa ung thư.";
        assertEquals(vocabulary.getExampleVN(),result);
    }
}