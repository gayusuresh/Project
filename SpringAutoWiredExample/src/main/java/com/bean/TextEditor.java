package com.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor 
{
	@Autowired
	private SpellChecker spellChecker;
	
	public TextEditor()
	{
		System.out.println("texteditor method");
	}
	public TextEditor(SpellChecker spellChecker)
	{
		this.spellChecker=spellChecker;
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	

}
