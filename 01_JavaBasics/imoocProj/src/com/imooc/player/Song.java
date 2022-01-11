package com.imooc.player;

import java.util.Objects;

public class Song {
	private String id;
	private String name;
	private String singer;
	
	public Song(String id, String name, String singer) {
		this.id = id;
		this.name = name;
		this.singer = singer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, singer);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj.getClass() == Song.class) {
			Song song = (Song)obj;
			return (song.getId().equals(id)) && (song.getName().equals(name)) && (song.getSinger().equals(singer));
		}
		return false;
		
	}
	
	@Override
	public String toString() {
		return "song info: id is" + id + ", song name: " + name + ", song singer: " + singer;
	}
	
}
