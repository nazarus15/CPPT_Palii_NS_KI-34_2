package KI_34.Palii.lab4;

public class Memory {
    public int memory;
    public int stored_memory;
    public int memory_left;
    public int songs_downloaded;
    public int songs_to_download_left;

    public Memory(){
        memory = 100;
        stored_memory = 20;
        memory_left = memory - stored_memory;
        songs_downloaded = stored_memory/5;
        songs_to_download_left = memory_left/5;
    }

    public Memory(int MegaBytes_has, int Songs_downloaded){
        memory = MegaBytes_has;
        songs_downloaded = Songs_downloaded;
        stored_memory = songs_downloaded*5;
        memory_left = memory - stored_memory;
        songs_to_download_left = memory_left/5;
    }

    void DownloadSongs(int Number_of_songs){
        songs_downloaded = songs_downloaded + Number_of_songs;
        if(songs_downloaded > songs_to_download_left){
            System.out.print("Memory is full\n Downloaded only " + (Number_of_songs-songs_to_download_left) + "songs\n");
        }
    }


    float ret_memory(){
        return memory;
    }

    float ret_stored_memory(){
        return stored_memory;
    }

    void ShowSongs(){
        System.out.print("\nSongs: " + songs_downloaded + "\nSongs left to download: " + songs_to_download_left + "\n");
    }

}
