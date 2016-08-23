package comhuynhtastic.github.forgetful;

/**
 * Created by Richard Huynh on 8/22/2016.
 */
public class Tip {

    private String mTitle;
    private int mImgResourceId;
    private String mTipText;

    /**
     * Constructor to build tip object
     * @param title the title of the tip
     * @param imgResourceId the id of the picture to use
     * @param tipText the actual tip for the users to read
     */
    public Tip(String title, int imgResourceId, String tipText) {
        mTitle = title;
        mImgResourceId = imgResourceId;
        mTipText = tipText;
    }

    /**
     * Gives the object's title
     * @return the title of the tip
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Gives the object's image resource id
     * @return the image id
     */
    public int getImgResourceId() {
        return mImgResourceId;
    }

    /**
     * Gives the object's tip text
     * @return the tip for the user to read
     */
    public String getTipText() {
        return mTipText;
    }

}
