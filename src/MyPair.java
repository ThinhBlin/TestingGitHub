public class MyPair <T,U>{
    public final T Fst;
    public final U Snd;
    public MyPair(T Fst,U Snd){
        this.Fst=Fst;
        this.Snd=Snd;
    }
    public MyPair<T,U> swap(){
        MyPair<T,U> temp= new MyPair<>((T)this.Snd,(U)this.Fst);
        return temp;
    }
    public String toString(){
        return "(" + Fst + ", " + Snd + ")";
    }
}
