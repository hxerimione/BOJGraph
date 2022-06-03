package BOJGraph.core.grade;

public class User {
    private String name;
    private Long[] level;
    private Long[] exp;

    public Long[] getExp() {
        return exp;
    }

    public void setExp(Long[] exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long[] getLevel() {
        return level;
    }

    public void setLevel(Long[] level) {
        this.level = level;
    }
}
