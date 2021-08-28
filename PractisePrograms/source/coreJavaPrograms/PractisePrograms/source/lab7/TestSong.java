package coreJavaPrograms.PractisePrograms.source.lab7;
public class TestSong
{
    public static void main(String[] args)
    {
        Song s1=new Song("amma","mynave mynave ni oru");
        Song s2=new Song("mumuy");
        // s1.setName("myna");
        // s2.setName("pooo");
        // s1.setLyrics("mynave mynave mynave");
        // s2.setLyrics("innsai padi varum");
        s2.setLyrics("amma ammani enga amma");
        
        s1.play();
        s2.play();
    }
}