package cn.blooming.design.chainOfResponsibility;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void handlerRequest(Request request) {
        if(request.getType().equals("请假")){
            System.out.println(name+":"+request.getContent()+"，数量："+request.getNumber()+"被批准");
        }else{
            if(superior!=null){
                superior.handlerRequest(request);
            }
        }
    }
}
