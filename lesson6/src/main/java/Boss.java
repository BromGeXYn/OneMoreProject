public class Boss implements ProfessionInfo{

    @Override
    public void getProfInfo() {
        System.out.println(getClass().getSimpleName());
    }
}
