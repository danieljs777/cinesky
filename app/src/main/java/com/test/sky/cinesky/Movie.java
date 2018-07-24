package com.test.sky.cinesky;

public class Movie {
    private String id;

    private String[] backdrops_url;

    private String duration;

    public String title;

    public String cover_url;

    public String overview;

    public String release_year;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getBackdrops_url ()
    {
        return backdrops_url;
    }

    public void setBackdrops_url (String[] backdrops_url)
    {
        this.backdrops_url = backdrops_url;
    }

    public String getDuration ()
    {
        return duration;
    }

    public void setDuration (String duration)
    {
        this.duration = duration;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getCover_url ()
    {
        return cover_url;
    }

    public void setCover_url (String cover_url)
    {
        this.cover_url = cover_url;
    }

    public String getOverview ()
    {
        return overview;
    }

    public void setOverview (String overview)
    {
        this.overview = overview;
    }

    public String getRelease_year ()
    {
        return release_year;
    }

    public void setRelease_year (String release_year)
    {
        this.release_year = release_year;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", backdrops_url = "+backdrops_url+", duration = "+duration+", title = "+title+", cover_url = "+cover_url+", overview = "+overview+", release_year = "+release_year+"]";
    }
}