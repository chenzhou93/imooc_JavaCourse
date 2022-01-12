package com.imooc.player;

import java.util.Scanner;

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
	
	public void testPlayListCollection() {
		Song song1 = new Song("s001", "two tigers", "sun group");
		Song song2 = new Song("s002", "bird", "fly");
		Song song3 = new Song("s003", "jasmine", "rainbow");
		
		PlayList mainPlayList = new PlayList("main");
		mainPlayList.addToPlayList(song1);
		mainPlayList.addToPlayList(song2);
		mainPlayList.addToPlayList(song3);
		
		PlayList favoritePlayList = new PlayList("fav songs");
		favoritePlayList.addToPlayList(mainPlayList.getMusicList().get(0));
		favoritePlayList.addToPlayList(mainPlayList.getMusicList().get(1));
		
		//Add 2 playlists to collection
		PlayListCollection plc = new PlayListCollection();
		plc.addPlayList(mainPlayList);
		plc.addPlayList(favoritePlayList);
		
		PlayList playList = plc.searchPlayListByName("fav songs");
		playList.displayAllSong();
		
	}
	
	public void mainMenu() {
		System.out.println("********************");
		System.out.println("main menu");
		System.out.println("1--manage list");
		System.out.println("2--manage player");
		System.out.println("0--exit");
		System.out.println("********************");
	}
	
	public void playListMenu() {
		System.out.println("********************");
		System.out.println("manage playlist");
		System.out.println("1--add song to main list");
		System.out.println("2--add song to regular list");
		System.out.println("3--search song by id");
		System.out.println("4--search song by name");
		System.out.println("5--update");
		System.out.println("6--display");
		System.out.println("7--delete");
		System.out.println("9--main menu");
		System.out.println("********************");
	}
	
	public void playerMenu() {
		System.out.println("********************");
		System.out.println("manage player");
		System.out.println("1--add playlist to player");
		System.out.println("2--delete playlist from player");
		System.out.println("3--search playlist by id");
		System.out.println("4--display playlist");
		System.out.println("********************");
	}
	
	
	//Main
	public void test() {
		TestDemo td = new TestDemo();
		Scanner sc = new Scanner(System.in);
		int input =0, input1 = 0, input2=0;
		while(true) {
			td.mainMenu();
			System.out.println("input number");
			input = sc.nextInt();
			if(input == 0) {
				break;
			}
			switch(input) {
			case 1:
				while(true) {
					td.playListMenu();
					System.out.println("input number to manage PLAYLIST");
					input1 = sc.nextInt();
					if(input1==9) {
						break;
					}
					switch(input1) {
						case 1: System.out.println("add to main PLAYLIST"); break;
						case 2: System.out.println("add to regular PLAYLIST"); break;
						case 3: System.out.println("search PLAYLIST by id"); break;
						default: System.out.println("no op"); break;
					}
				}
				break;
			case 2:
				while(true) {
					td.playerMenu();
					System.out.println("input number to manage PLAYER");
					input2 = sc.nextInt();
					if(input2 == 9) {
						break;
					}
					switch(input2) {
						case 1: System.out.println("add list to PLAYER"); break;
						case 2: System.out.println("delete list from PLAYER"); break;
						case 3: System.out.println("get PLAYER by name"); break;
						default: System.out.println("no op"); break;
					}
					
				}
				break;
			default:
				System.out.println("no operation"); 
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo td = new TestDemo();
		//td.testSong();
		//td.testPlayList();
		//td.testPlayListCollection();
		
		td.test();
	}

}
