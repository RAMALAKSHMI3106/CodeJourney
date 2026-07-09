public class CalculateResale {
    public static void main(String[] args) {
        int initial_cost = 5000; 
        int depreciation_Rate = 5; 
        int years = 5; 

        double resaleValue = calculateResaleValue(initial_cost, depreciation_Rate, years);
        System.out.println("Resale value : " + resaleValue);
    }

    public static float calculateResaleValue(int initial_cost, int depreciation_rate, int years) {
    float sell_price = initial_cost;

    for (int i = 0; i < years; i++) {
        sell_price = sell_price - (sell_price * depreciation_rate / 100);
    }

    return sell_price;
}
}