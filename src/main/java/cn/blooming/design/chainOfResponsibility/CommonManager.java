package cn.blooming.design.chainOfResponsibility;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if(request.getType().equals("请假") && request.getNumber()<=2){
            System.out.println(name+":"+request.getContent()+"，数量："+request.getNumber()+"被批准");
        }else{
            if(superior!=null){
                superior.handlerRequest(request);
            }
        }
    }
}
