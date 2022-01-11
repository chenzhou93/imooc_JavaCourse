package com.imooc.player;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
	private String playListName;
	private List<Song> musicList;
	
	public PlayList(String playListName) {
		this.playListName = playListName;
		musicList = new ArrayList<Song>();
	}
	
	public void addToPlayList(Song song) {
		boolean flag = false;
		for(Song song1 : musicList) {
			if(song1.equals(song)) {
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("already exists");
		}else {
			musicList.add(song);
		}
	}
	
	public Song searchSongById(String id) {
		Song song = null;
		for(Song song1 : musicList) {
			if(song1.getId().equals(id)) {
				song = song1;
				break;
			}
		}
		return song;
	}
	
	public Song searchSongByName(String name) {
		Song song = null;
		for(Song song1 : musicList) {
			if(song1.getName().equals(name)) {
				song = song1;
				break;
			}
		}
		return song;
	}
	
	public void updateSong(String id, Song song) {
		Song song1 = searchSongById(id);
		if(song1 != null) {
			musicList.remove(song1);
			musicList.add(song);
			System.out.println("success");
		}
	}
	
	public void deleteSong(String id) {
		Song song = searchSongById(id);
		if(song != null) {
			musicList.remove(song);
		}
	}
	
	public void displayAllSong() {
		System.out.println("all songs in the playlist");
		for(Song song : musicList) {
			System.out.println(song);
		}
	}

}
