package Shoetudio.spring.mvc.vo;

// 회원 게시판
public class Community {

    protected String cmno;
    protected String title;
    protected String userid;
    protected String regdate;
    protected String views;
    protected String thumbup;
    protected String contents;
    protected String fnames;
    protected String fsizes;
    protected String uuid;
    protected String todie;

    public String getCmno() {
        return cmno;
    }

    public void setCmno(String cmno) {
        this.cmno = cmno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getThumbup() {
        return thumbup;
    }

    public void setThumbup(String thumbup) {
        this.thumbup = thumbup;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getFnames() {
        return fnames;
    }

    public void setFnames(String fnames) {
        this.fnames = fnames;
    }

    public String getFsizes() {
        return fsizes;
    }

    public void setFsizes(String fsizes) {
        this.fsizes = fsizes;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getTodie() {
        return todie;
    }

    public void setTodie(String todie) {
        this.todie = todie;
    }
}
