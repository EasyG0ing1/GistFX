package com.redmondsims.gistfx.help.html;

public class SomethingWrong {
	public static final String html = """
			<h1 style="text-align:center;~background~;~color~">If Something Goes Wrong</h1>\
			<p>There are really only two possible areas where something can go wrong:</p>

			<ol>
			    <li>Failures in uploading data to GitHub</li>
			    <li>Failures in saving data to the local database</li>
			</ol>

			<h3>GitHub</h3>

			<p>Whenever you chose to save data, either the entre Gist, which will include all of the files within the Gist, whether you changed them or not (shotgun approach), or when you chose to save an individual file, GistFX utilizes the connection
			    that was established to GitHub when you first logged into the program. To my knowledge, GitHub does not &quot;time out&quot; the authentication token that is established and maintained by the GitHub Java API, but I am not certain about
			    this. If you received an error indicating a problem saving to GitHub, and your Internet connection is known to be up and working, then simply close GistFX and re-open it, which will re-establish a connection to your account.</p>
			<BR>
			<p>When you close GistFX for that reason, then simply say no when it asks about committing unsaved data. Because when GistsFX first logs you in, and you see that it is <strong>Downloading Gist Objects</strong>, this means that GistFX is
			    downloading your Gists and each of your Gists files from GitHub into memory. Once they are loaded and you are shown the main form, GistFX then goes through each Gist and file that was loaded and compares it with the versions that exist
			    in the local database. If there are discrepancies, you are given the option to choose which version you wish to keep. And in the case where you simply closed then re-opened the application, choose to keep the <strong>LOCAL
			        VERSION</strong>.</p>
			<BR>
			<h3>SQL</h3>

			<p>Errors while saving to SQL are a bit different. Usually, this only happens when the database file itself gets corrupted, or something goes wrong with the SQL engine that runs in the background within GistFX. Either way, if closing then
			    re-opening GistFX does not resolve the problem, then you will need to delete the .SQL file from the root of GistFX&#39;s installation folder or whichever folder contains GistFX.java. In that folder, you will see a file called
			    database.SQL. Make sure GistFX is not running, then delete that file, then re-run GistFX. When GistFX re-creates the SQL file and downloads your Gists into memory, it will compare the names of your Gists with the names that are stored
			    in parallel in a JSON file and will attempt to map the custom names that you assigned to your Gists with the names in that file and it should recover those for you.</p>
			</body>""";

}
