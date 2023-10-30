package blackBox;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";

        // 자동 신고 기능 메소드
        b1.autoReport();
        BlackBox.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        int fileCount = b1.getVideoFileCount(1); // 일반 영상
        System.out.println("일반 영상 파일 수 : " + fileCount + "개");

        fileCount = b1.getVideoFileCount(2); // 이벤트 영상(충돌 감지)
        System.out.println("이벤트 영상 파일 수 : " + fileCount + "개");
    }
}
