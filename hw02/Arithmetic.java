// Clarisa Kelly
// February 2, 2015
// Arithmetic HW #2


public class Arithmetic {
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        double TAX= 0.06; // tax as a percent
        //Cost per pair of socks
        double sockCost$ = 2.58;
        double socksBeforeTax = sockCost$*nSocks; //total cost of socks before tax
        double socksTax = socksBeforeTax*TAX;

        //Number of drinking glasses
        int nGlasses= 6;
        //Cost per glass
        double glassCost$ = 2.29;
        double glassBeforeTax = glassCost$*nGlasses; //total cost of glasses before tax
        double glassTax = glassBeforeTax*TAX;

        //Number of boxes of envelopes
        int nEnvelopes = 1;
        //cost per box of envelopes
        double envelopeCost$ =3.25;
        double envelopeTax = envelopeCost$*TAX;
        
        double totalTaxPercent = 1.06; // tax multiplier to find total
        
        double totalSockCost$ = nSocks * sockCost$ * totalTaxPercent; //total cost of socks
        double totalGlassesCost$ = nGlasses * glassCost$ * totalTaxPercent; //total cost of glasses
        double totalEnvelopeCost$ = nEnvelopes * envelopeCost$ * totalTaxPercent; //total cost of envelopes
        
        double totalItemCostPreTax$ = nSocks * sockCost$ + nGlasses * glassCost$ + nEnvelopes * envelopeCost$; //total cost of all items before tax
        double totalItemTax = totalItemCostPreTax$ * TAX;
        double totalFinalCost$ = totalItemCostPreTax$ * totalTaxPercent; //total amount paid for all items w tax
        
        System.out.println("A number of "+nSocks+" socks were purchased at $"+sockCost$+" per sock.");
        System.out.println("The total cost of the socks before tax is $"+socksBeforeTax);
        System.out.println("The sales tax on "+nSocks+" socks is $"+socksTax);
        System.out.println(" ");
        System.out.println("A number of "+nGlasses+" glasses were purchased at $"+glassCost$+" per glass.");
        System.out.println("The total cost of the glasses before tax is $"+glassBeforeTax);
        System.out.println("The sales tax on "+nGlasses+" glasses is $"+glassTax);
        System.out.println(" ");
        System.out.println("A number of "+nEnvelopes+" envelopes were purchased at $"+envelopeCost$+" per envelope.");
        System.out.println("The total cost of the envelopes before tax is $"+envelopeCost$);
        System.out.println("The sales tax on "+nEnvelopes+" envelope is $"+envelopeTax);
        System.out.println(" ");
        System.out.println("The total cost of all items before tax is $"+totalItemCostPreTax$);
        System.out.println("The sales tax of all items are $"+totalItemTax);
        System.out.println("The total amount paid is $"+totalFinalCost$);
    }
}
        
        