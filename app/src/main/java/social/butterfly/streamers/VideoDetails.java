package social.butterfly.streamers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Ansh on 29/10/2017 12:26 AM.
 */

public class VideoDetails {
    String VideoName;
    String VideoDesc;
    String URL;
    String VideoId;
    String Data;
    String YoutubeName;
    String ChannelTitle;
    String PublishedAt;


    public void setVideoName(String VideoName) {
        this.VideoName = VideoName;
    }

    public String getVideoName() {
        return VideoName;
    }

    public void setVideoDesc(String VideoDesc) {
        this.VideoDesc = VideoDesc;
    }

    public String getVideoDesc() {
        return VideoDesc;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getURL() {
        return URL;
    }

    public void setVideoId(String VideoId) {
        this.VideoId = VideoId;
    }

    public String getVideoId() {
        return VideoId;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getData() {
        return Data;
    }

    public void setYoutubeName(String YoutubeName) {
        this.YoutubeName = YoutubeName;
    }

    public String getYoutubeName() {
        return YoutubeName;
    }

    public void setChannelTitle(String ChannelTitle) {
        this.ChannelTitle = ChannelTitle;
    }

    public String getChannelTitle() {
        return ChannelTitle;
    }

    public void setPublishedAt(String PublishedAt) {
        this.PublishedAt = PublishedAt;
    }

    public String getPublishedAt()
    {
        SimpleDateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        SimpleDateFormat outFormat = new SimpleDateFormat("dd-MM-yyyy (HH:mm:ss)");

        try {
            Date date = inFormat.parse(this.PublishedAt);
            return outFormat.format(date);
        }
        catch (Exception ex){
            return this.PublishedAt;
        }
    }


}
