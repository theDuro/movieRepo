package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class CreateMovieDto implements Serializable {
    private String title;
    private String image;
    private Integer year;
    private String videoId;
    private CreateMovieDto(Builder builder){
        title = builder.title;
        image = builder.image;
        year = builder.year;
        videoId = builder.videoId;

    }
    public static final class Builder {
        private String title;
        private String image;
        private Integer year;
        private String videoId;
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }
        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }


        public Builder() {
        }

        public CreateMovieDto build() {
            return new CreateMovieDto(this);
        }
    }




    public CreateMovieDto() {
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }

    public String getVideoId() {
        return videoId;
    }

    @Override
    public String toString() {
        return "CreateMovieDto{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", videoId='" + videoId + '\'' +
                '}';
    }



}
