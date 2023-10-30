package blackBox.camera;

public class SpeedCam {

    public String name;

    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void takePicture() {
        // 사진 촬영


    }

    public void recordVideo() {
        // 동영상 녹화


    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate() {
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }
}
