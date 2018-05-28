To run on Openshift
-------------------

oc new-project wfswarm

oc new-app openshift/redhat-openjdk18-openshift:1.3~https://github.com/tnscorcoran/wfswarm.git

oc expose service wfswarm

In the same way, test it out:

curl route/books/listbooks

in my case:

curl http://wfswarm-wfswarm.apps.1.1.1.1.nip.io/books/listbooks
