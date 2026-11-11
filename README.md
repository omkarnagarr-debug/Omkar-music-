# OMKAR MUSIC — Android starter

This is the first native Android MVP:
- Dark black + gold Compose UI
- Online / Local tabs
- Local audio permission and MediaStore library scan
- Local playback using AndroidX Media3 ExoPlayer
- GitHub Actions workflow to build a debug APK

## Build APK without a PC
1. Create a new GitHub repository named `OMKAR-MUSIC`.
2. Upload the contents of this ZIP to the repository root (not the ZIP itself).
3. Make sure the branch is named `main`.
4. Open the repository's **Actions** tab.
5. Open **Build OMKAR MUSIC APK** and tap **Run workflow** (or push a commit).
6. When the run finishes, open it and download the artifact `omkar-music-debug-apk`.
7. Extract the artifact ZIP and install `app-debug.apk` on your phone.

## Important current limits
- Online tab is a placeholder until a licensed provider API or your own streaming server is selected.
- Playback currently works while the app is open. Background playback, notification controls, search, album art, playlists, and equalizer are later milestones.
- This starter has not been built on your device yet; if GitHub Actions reports an error, share the error screenshot/log and we will fix it.
