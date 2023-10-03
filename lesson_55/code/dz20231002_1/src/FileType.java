package dz20231002_1.src;

public enum FileType {
    GIF(".gif"),
    JPG(".jpg"),
    CLASS(".class");

    public String getExt() {
        return ext;
    }

    FileType(String ext) {
        this.ext = ext;
    }

    private String ext;

}