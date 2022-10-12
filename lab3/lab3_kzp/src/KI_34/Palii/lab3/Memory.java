//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package KI_34.Palii.lab3;

public class Memory {
    public int memory;
    public int stored_memory;
    public int memory_left;
    public int songs_downloaded;
    public int songs_to_download_left;
    public static int MinimalMemory = 100000000;

    public Memory() {
        this.memory = 100;
        this.stored_memory = 20;
        this.memory_left = this.memory - this.stored_memory;
        this.songs_downloaded = this.stored_memory / 5;
        this.songs_to_download_left = this.memory_left / 5;
    }

    public Memory(int MegaBytes_has, int Songs_downloaded) {
        this.memory = MegaBytes_has;
        this.songs_downloaded = Songs_downloaded;
        this.stored_memory = this.songs_downloaded * 5;
        this.memory_left = this.memory - this.stored_memory;
        this.songs_to_download_left = this.memory_left / 5;
        if (MegaBytes_has < MinimalMemory) {
            MinimalMemory = MegaBytes_has;
        }

    }

    static void retMIN() {
        System.out.println(MinimalMemory);
    }

    void DownloadSongs(int Number_of_songs) {
        this.songs_downloaded += Number_of_songs;
        if (this.songs_downloaded > this.songs_to_download_left) {
            int var10001 = Number_of_songs - this.songs_to_download_left;
            System.out.print("Memory is full\n Downloaded only " + var10001 + "songs\n");
        }

    }

    void ShowMemory() {
        System.out.print("\nMemory: " + this.memory + "\nStored memory: " + this.stored_memory + "\n");
    }

    void ShowSongs() {
        System.out.print("\nSongs: " + this.songs_downloaded + "\nSongs left to download: " + this.songs_to_download_left + "\n");
    }
}
