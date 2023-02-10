public class Boksor {

    String name;
    int damage;
    int healty;
    int weight;

    Boksor(String name,int damage,int healty,int weight){
        this.damage=damage;
        this.healty=healty;
        this.name=name;
        this.weight=weight;
    }
    int vurus (Boksor rakip){
        System.out.println(this.name + " => " + rakip.name + " " + this.damage + " hasar verdi" );
        return rakip.healty - this.damage;
    }
}
