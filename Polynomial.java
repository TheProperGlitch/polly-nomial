import java.util.ArrayList;

class Polynomial {

     
    private ArrayList<Double> c = new ArrayList<Double>();
    //C is a ArrayList of doubles that stores the Polynomial's coefficants at the index of the terms power. 
    
    public Polynomial(){    
    /* 
     * Inputs: N/A
     * Outputs: Constructs a Polynomial using the standard constructor
     * Effects: N/A
     */
    }
    
   
    public Polynomial(Double[] lizt){
    /* 
     * Inputs: An array of doubles stored as lizt
     * Outputs: Constructs a Polynomial
     * Effects: Adds the Doubles from list to c
     */
        for(int i = 0; i < lizt.length ; i ++){
            c.add(lizt[i]);
        }
    }
    
    public Polynomial add(Polynomial other){
    /* 
     * Inputs: A Polynomial stored as other
     * Outputs: A Polynomial which is the result of adding the current Polynomial with other
     * Effects: N/A
     */
        Polynomial retval = new Polynomial();
        while(this.c.size() > other.c.size()){
            other.c.add(0.0);
        }
        for(int k =0 ; k < c.size() ; k++){
            retval.c.add(
            other.c.get(k)
            + 
            this.c.get(k));
        }

        return retval;
    }

    
    
    public Polynomial multi(Polynomial other){
    /* 
     * Inputs: A Polynomial stored as other
     * Outputs: A Polynomial which is the result of multiplying the current Polynomial with other
     * Effects: N/A
     */
        Polynomial retval = new Polynomial();
        int e = 0;
        for (int i = 0; i < c.size() * other.c.size(); i++){
            retval.c.add(0.0);
        }
        for (int a = 0; a < c.size(); a++) {
            for (int b = 0; b < other.c.size(); b++) {
                e = a + b;
                retval.c.set(e, (this.c.get(a) * other.c.get(b)) + retval.c.get(e));
            }
        }
        return retval;
    }

    public int eval(int x){
    /* 
     * Inputs: An int stored as x
     * Outputs: An int which is equal to the current Polynomial if you replaced every x in the polynomial with x 
     * Effects: N/A
     */
        int retval = 0;
        for (int i = 0; i < c.size() ; i++) {
            retval += c.get(i) * Math.pow(x,i);
        }
        return retval;
    }
    

    public String toStrange() {
    /* 
     * Inputs: N/A
     * Outputs: The current Polyomial in the form of a string
     * Effects: N/A
     */
        String retval = "";
        for (int i = 0; i < c.size(); i++){
            if (i == 0){
                 if (!(c.get(i) == 0.0)) {
                    if (c.get(i).toString().substring(c.get(i).toString().length() -2).equals(".0")) {
                    retval += c.get(i).toString().substring(0, c.get(i).toString().length()-2) + " + ";
                    } else {
                    retval +=  c.get(i) + " + ";
                    }
                }
            }
            else if (i == 1){
                if (!(c.get(i) == 0.0)) {
                    if (c.get(i).toString().substring(c.get(i).toString().length() -2).equals(".0")) {
                        retval += c.get(i).toString().substring(0, c.get(i).toString().length()-2) + "x + ";
                    } else {
                    retval +=  c.get(i) + "x + ";
                    }
                }
            }
            else if (!(c.get(i) == 0.0)) {
                if (c.get(i).toString().substring(c.get(i).toString().length() -2).equals(".0")) {
                    retval += c.get(i).toString().substring(0, c.get(i).toString().length()-2) + "x^" + i + " + ";
                    } else {
                        retval +=  c.get(i) + "x^" + (i) + " + ";
                    }
            }
        }
        retval = retval.substring(0, retval.length() - 3);
        return retval;
    }
}

