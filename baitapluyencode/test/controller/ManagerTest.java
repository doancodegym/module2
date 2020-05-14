package controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void addVocabulary() {
       ;
    }

    @Test
    void edit() {
    }

    @Test
    void delete() {
    }

    @Test
    void search() {
    }

    @Test
    void showInfo() {
        Manager manager = new Manager();
        String[] list = {"aspect","(n.)","khía cạnh","http://audio.tflat.vn/audio/a/s/aspect.mp3","She felt she had looked at the problem from every aspect.","Cô ấy cảm thấy rằng cô ấy đã nhìn nhận vấn đề từ mọi khía cạnh."};
        manager.addVocabulary(list);

        String result = "Từ vựng : affect(v.) : ảnh hưởng\n" +
                "Phát âm : http://audio.tflat.vn/audio/a/f/affect.mp3\n" +
                "Ví dụ :  The divorce affected every aspect of her life. (Việc ly hôn ảnh hưởng mọi mặt của cuộc sống của cô.)";
    }
}