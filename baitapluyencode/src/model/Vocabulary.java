package model;

public class Vocabulary implements Infomation {
    private String name, type, translate,link,example, exampleVN;

    public Vocabulary() {
    }

    public Vocabulary(String name, String type, String translate, String link, String example, String exampleVN) {
        this.name = name;
        this.type = type;
        this.translate = translate;
        this.link = link;
        this.example = example;
        this.exampleVN = exampleVN;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getExampleVN() { return this.exampleVN; }

    public void setExampleVN(String exampleVN) { this.exampleVN = exampleVN; }

    @Override
    public void info() {
        System.out.println("Từ vựng : " + this.getName() + this.getType() + " : "+this.getTranslate());
        System.out.println("Phát âm : " + this.getLink());
        System.out.println("Ví dụ : " + this.getExample()+"("+this.getExampleVN()+")");
        System.out.println("====================");

    }
}
