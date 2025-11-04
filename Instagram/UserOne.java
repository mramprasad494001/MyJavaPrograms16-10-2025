public class UserOne implements SocialMediaApp {
    private String userName;
    private String userId;

    UserOne(){}
    UserOne(String userName, String userId){
        this.userName=userName;
        this.userId=userId;
    }

    @Override
    public void reels(){
        System.out.println("watching reels");
    }
    @Override
    public void story(){
        System.out.println("watching story");
    }
}
