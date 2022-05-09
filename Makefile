MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java
	echo "nmsl"
MarkdownParse.class: MarkdownParseTest.java MarkdownParse.class
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParseTest.java
