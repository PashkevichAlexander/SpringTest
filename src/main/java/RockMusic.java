public class RockMusic implements Music{
    public void DoMyInit(){
        System.out.println("Doing my initialization");
    }
    public void DoMyDestroy(){
        System.out.println("Do destroy");
    }
    @Override
    public String getSong() {
        return "guitarMusic";
    }
}
