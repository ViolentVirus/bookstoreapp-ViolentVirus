# PlayTemplate

## Install sbt on our Chromebooks
In the linux terminal from our classroom computers, type:
```
$ robuntu-install -app 2
```

## Install sbt on any Linux system
From the terminal type:
```
echo "deb https://dl.bintray.com/sbt/debian /" | sudo tee -a /etc/apt/sources.list.d/sbt.list
sudo apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823
sudo apt-get update
sudo apt-get install sbt
```

## Install sbt on Windows
[Download sbt here](https://www.scala-sbt.org/download.html).
Then follow the install instructions.

## Install Scala IntelliJ Plugin
1. Open IntelliJ.
2. Go to `Configure -> Plugins`.
3. Search for `sbt`.
    - If it doesnt show, click `Search in repositories`.
4. Click on the `Scala` plugin and click `Install`.
5. Once it is done, you will have to restart IntelliJ.
    
## Beginning with a template (Beginner)
I have created a template on GitHub that has everyting we need to get going. Follow the steps.

```
$ cd <your-directory>
$ wget https://github.com/MrGallo/PlayTemplate/archive/master.zip
$ unzip master.zip
$ mv PlayTemplate-master <NameOfApp>
```

**Continue to "Import with IntelliJ".**


## Creating an application from scratch (Advanced)
This option does not include Bootstrap 4. I recommend you use the template above.
```
$ cd <your-directory>
$ sbt new playframework/play-java-seed.g8
  - name: Wait for dialogue to enter name of application
  - organization: (leave blank)
  - scala_version: (leave blank)
  - play_version: (leave blank)
  - sbt_version: 1.1.1
```

## Import into IntelliJ

1. Open IntelliJ
2. Import Project
3. Navigate to your new application's folder. Click on the main folder, click `Ok`.
4. Select `import project from external model`.
5. Select `sbt`, then press `Next`.
6. On the next page, ensure the `Project JDK` is set to `Java 8`.
7. Click `Finished`.
8. There are a couple processes that have to run when you first open the project. Just wait... Could take several minutes.

## Running the application
1. Head over to the terminal, `$ cd <application-directory>`.
2. Type `sbt run` to start the local web server. This will take a little time as well.
3. When the terminal says `[info] p.c.s.AkkaHttpServer - Listening for HTTP on /0:0:0:0:0:0:0:0:9000`, go to your web browser and go to the URL `localhost:9000`.
    - The fist time you do it, it needs to compile every file, its faster when you do it the next time.
    - Took my computer about 45 seconds the first time.
4. When the above step is complete, your browser should see a webpage that says "Welcome to Play!"
    - At this point we can leave the server running, make changes to our app, then reload the browser.

## Working from home
### Create new project
If creating a new project, follow the above instrictions under **Beginning with a template (Beginner)** and then **Import into IntelliJ**. If you have a GitHub repo already established, see below.

### Cloning your repo
- Close any already-open projects.
    - `File -> Close Project`
- In the menu, click `Check out from version control -> GitHub`
    - You may have to log into GitHub here with your GitHub login info.
- Clone repository
    - Enter the URL to your GitHub repo you want to set up on your computer
        - When you are logged in, all your GitHub repos are available in the drodown menu (`Git Repository URL`).
    - Enter the directory name (usually the same name as the repo)
    - Press `Clone`
- Import Project from Gradle
    - The defaults here should be fine, click `ok`
- Wait (could take 5 minutes or more)

Once your repo is clones on your computer, you shouldn't have to clone it again. Simply use the `git` command line and `git pull` in any changes you have made.


    
