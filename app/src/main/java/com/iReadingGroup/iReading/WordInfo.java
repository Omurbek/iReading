package com.iReadingGroup.iReading;

/**
 * Created by taota on 2018/3/29.
 */
public class WordInfo {
    private String word;
    private String meaning;
    private int imageId;

    /**
     * Instantiates a new Word info.
     *
     * @param word    the word
     * @param meaning the meaning
     * @param imageId the image id
     */
    public WordInfo(String word, String meaning, int imageId) {
        this.word = word;//word
        this.meaning = meaning;//meaning
        this.imageId = imageId;//image
    }

    /**
     * Sets word.
     *
     * @param word the word
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Set meaning.
     *
     * @param meaning the meaning
     */
    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    /**
     * Sets image id.
     *
     * @param imageId the image id
     */
    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    /**
     * Gets word.
     *
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * Get meaning string.
     *
     * @return the string
     */
    public String getMeaning() {
        return meaning;
    }

    /**
     * Gets image id.
     *
     * @return the image id
     */
    public int getImageId() {
        return imageId;
    }
}