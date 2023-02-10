import javax.swing.plaf.synth.SynthOptionPaneUI;

public class BoksMaci {
    Boksor b1;
    Boksor b2;
    int minWeight;
    int maxWeight;

    BoksMaci(Boksor b1,Boksor b2, int minWeight, int maxWeight){
        this.b1=b1;
        this.b2=b2;
        this.maxWeight=maxWeight;
        this.minWeight=minWeight;
    }
    void run (){
        if (isCheck()){
            while (this.b1.healty > 0 && this.b2.healty > 0){

                System.out.println("YENI ROUND ");
            this.b2.healty=this.b1.vurus(this.b2);
                System.out.println("Kalan Can: " +this.b2.healty);

                if (isWin()){
                    break;
                }
                System.out.println("YENI ROUND");
                this.b1.healty=this.b2.vurus(this.b1);
                System.out.println("Kalan Can: " + this.b1.healty);

                if (isWin()){
                    break;
                }
            }
        }
        else
        {
            System.out.println("Sporcuların agirliklari uymuyor");
        }
    }
    boolean isCheck(){
        return (this.b1.weight >= minWeight && this.b1.weight<=maxWeight) &&
                (this.b2.weight >= minWeight && this.b2.weight<=maxWeight);
    }
    boolean isWin (){
        if (this.b1.healty==0){
            System.out.println("Maci kazanan: "+this.b2.name);
            return true;
        }
        if (this.b2.healty==0){
            System.out.println("Maci Kazanan: " +this.b1.name);
            return true;
        }
        return false;
    }
}
