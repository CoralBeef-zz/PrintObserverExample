package PrintObserverExample;

public class Piikun implements Printable
{
    @Override
    public void print(String toPrint) {
        System.out.println("こんにちは！ピーくんです！");
        System.out.println("印刷するものを送って頂いてありがとうございます。メッセージはこちらです：");
        System.out.println(toPrint);
    }
    
}
