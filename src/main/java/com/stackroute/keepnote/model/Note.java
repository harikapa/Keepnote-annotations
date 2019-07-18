package com.stackroute.keepnote.model;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/*
 * The class "Note" will be acting as the data model for the Note data in the ArrayList.
 */
@Component
public class Note {

	private int noteId;
	private String noteTitle;
	private String noteContent;
	private String noteStatus;
	private LocalDateTime createdAt=LocalDateTime.now();
	/*
	 * This class should have five fields (noteId, noteTitle, noteContent,
	 * noteStatus and createdAt). This class should also contain the getters and
	 * setters for the fields. The value of createdAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */

	public Note() {

	}

	public Note(int noteId, String noteTitle, String noteContent, String noteStatus, LocalDateTime createdAt) {
		this.noteId = noteId;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.noteStatus = noteStatus;
		this.createdAt = createdAt;
	}
	/* All the getters/setters definition should be implemented here */

	public int getNoteId() {
		this.noteId=noteId;
		return noteId;

	}

	public void setNoteId(int intid) {

	}

	public String getNoteTitle() {
		this.noteTitle=noteTitle;
		return noteTitle;
	}

	public void setNoteTitle(String string) {

	}

	public String getNoteContent() {
		this.noteContent=noteContent;
		return noteContent;
	}

	public void setNoteContent(String string) {

	}

	public String getNoteStatus() {
		this.noteStatus=noteStatus;
		return noteStatus;
	}

	public void setNoteStatus(String string) {

	}

	public LocalDateTime getCreatedAt() {
		this.createdAt=createdAt;
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime localdatetime) {

	}

	/* Override the toString() method */

	@Override
	public String toString() {
		return "Note{" +
				"noteId=" + noteId +
				", noteTitle='" + noteTitle + '\'' +
				", noteContent='" + noteContent + '\'' +
				", noteStatus='" + noteStatus + '\'' +
				", createdAt=" + createdAt +
				'}';
	}
}