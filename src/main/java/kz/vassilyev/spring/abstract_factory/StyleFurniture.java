package kz.vassilyev.spring.abstract_factory;

public enum StyleFurniture {
    Modern("Modern"),
    ArtDeko("ArtDeko"),
    Victorian("Victorian");

    private final String style;

    StyleFurniture(String style) {
        this.style = style;
    }

    public String getStyle() {
        return style;
    }
}
