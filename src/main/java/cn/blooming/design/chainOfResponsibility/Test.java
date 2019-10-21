package cn.blooming.design.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        CommonManager commonManager = new CommonManager("经理");
        Majordomo majordomo = new Majordomo("总监");
        GeneralManager generalManager = new GeneralManager("总经理");

        majordomo.setSuperior(generalManager);
        commonManager.setSuperior(majordomo);

        Request request = new Request();
        request.setType("请假");
        request.setContent("tom请假");
        request.setNumber(3);
        commonManager.handlerRequest(request);
    }
}
