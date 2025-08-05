def call(string url, string branch){
    echo "This is Cloning the code"
    git url: "${url}" , branch : "${branch}"
    echo "code clonning successfull"
}
