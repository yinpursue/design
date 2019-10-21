package cn.blooming.design.chainOfResponsibility.liucheng;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if(request.getType().equals("请假")){
            System.out.println(name+" :"+request.getContent()+"，数量："+request.getNumber()+" 已批准");
            superior.handlerRequest(request);
        }else{

        }
    }
}
