#to create directory and Main.java

import os
import sys

folder_name = sys.argv[1]
os.mkdir(folder_name)
f = open('{}/Main.java'.format(folder_name),'w+')
f.write('/*\n\n*/\npublic class Main{\n\n\tpublic static void main(String[] args){\n\n\t}\n}')
f.close()