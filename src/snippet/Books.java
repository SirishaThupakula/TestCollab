package snippet;

import java.util.Objects;

public class Books {
public int id;
public String name;
public int stories;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getStories() {
	return stories;
}
public void setStories(int stories) {
	this.stories = stories;
}
@Override
public int hashCode() {
	return Objects.hash(id, name, stories);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Books other = (Books) obj;
	return id == other.id && Objects.equals(name, other.name) && stories == other.stories;
}
@Override
public String toString() {
	return "Books [id=" + id + ", name=" + name + ", stories=" + stories + "]";
}
public Books(int id, String name, int stories) {
	super();
	this.id = id;
	this.name = name;
	this.stories = stories;
}
	
}
