package Builder;

public class Client {
  
    
    public static void main(String[] args) 
    {
        BuilderPattern bp = BuilderPattern.getBuilder()
                                            .setV1(1)
                                            .setV2(2)
                                            .setV3("3")
                                            .build();
        System.out.println(bp.getV1());
    }
}
