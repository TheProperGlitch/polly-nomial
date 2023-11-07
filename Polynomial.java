import java.util.ArrayList;

class Polynomial {

    private ArrayList<Double> c = new ArrayList<Double>();

    public Polynomial(){    
    }

    public Polynomial(Double[] lizt){
        for(int i = 0; i < lizt.length ; i ++){
            c.add(lizt[i]);
        }
    }

    public Polynomial add(Polynomial other){
        Polynomial retval = new Polynomial();
        for(int k =0 ; k < c.size() ; k++){
            retval.c.add(other.c.get(k) + this.c.get(k));
        }

        return retval;
    }

    

    public Polynomial multi(Polynomial other){
        Polynomial retval = new Polynomial();
        int e = 0;
        for (int i = 0 ; i < c.size() + other.c.size(); i++){
            retval.c.add(0.0);
        }
        for (int a = 0; a < c.size(); a++ ){
            for(int b = 0; b < other.c.size(); b++){
                e = a+b;
                retval.c.set(e, (this.c.get(a) * other.c.get(b)) + retval.c.get(e));
            }
        }
        return retval;
    }

    public String toStrange() {
        String retval = "";
        for (int i = 0; i < c.size(); i++){
            if (i == 0){
                 if (!(c.get(i) == 0.0)) {
            retval +=  c.get(i) + " + ";
            }
            }
            if (!(c.get(i) == 0.0)) {
            retval +=  c.get(i) + "x^" + (i) + " + ";
            }
        }
        retval = retval.substring(0, retval.length() - 3);
        return retval;
    }
}

