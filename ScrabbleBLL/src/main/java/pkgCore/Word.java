package pkgCore;

import java.util.UUID;

public class Word implements Comparable<Word> {

	private UUID WordID;
	private String Word;

	public Word (String word)
	{
		this.WordID = UUID.randomUUID();
		this.Word = word;
		
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Complete the method. When does one word "equal" another? When the Word
		// attribute matches.
		return super.equals(obj);
	}

	@Override
	public int compareTo(Word o) {
		// TODO: Complete the 'compareTo' method to sort words by this.Word
		// alphabetically
		return 0;
	}

	public String getWord() {
		return Word;
	}
	public UUID getWordID() {
		return WordID;
	}

}
