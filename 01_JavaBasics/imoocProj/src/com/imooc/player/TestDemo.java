package com.imooc.player;

public class TestDemo {
	
	
	//Test song
	public void testSong() {
		Song song1 = new Song("s001", "two tigers", "sun group");
		Song song2 = new Song("s002", "bird", "fly");
		Song song3 = new Song("s003", "jasmine", "rainbow");
		System.out.println(song1);
		
		//Test equals
		System.out.println("song1 == song3" + song1.equals(song3));
	}
	
	public void testPlayList() {
		Song song1 = new Song("s001", "two tigers", "sun group");
		Song song2 = new Song("s002", "bird", "fly");
		Song song3 = new Song("s003", "jasmine", "rainbow");
		Song song4 = new Song("s004", "jasmine1", "rainbow1");
		
		PlayList mainPlayList = new PlayList("main");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		
		mainPlayList.displayAllSong();
		
		Song song = mainPlayList.searchSongById("s002");
		if(song != null) {
			System.out.println(song);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo td = new TestDemo();
		//td.testSong();
		td.testPlayList();
	}

}
