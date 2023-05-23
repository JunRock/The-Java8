public class EnumClass {
    public enum Week{
        MON("월"),TUE("화"),WED("수"),TUR("목"),FRI("금"),SAT("토"),SUN("일");

        private final String name;

        private Week(String name) {
            this.name=name;
        }
    }

    public static void main(String[] args) {

    }
}
