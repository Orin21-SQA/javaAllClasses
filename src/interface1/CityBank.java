package interface1;

public class CityBank implements Banking {
    @Override
    public float getInterestRate() {
        return 10.25f;
    }
    public void givenLoan(){
        System.out.println("Citybank provides special loan");
    }
}
