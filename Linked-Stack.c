#include<stdio.h>
#include<stdlib.h>

typedef struct List{
  int data;
  struct List *next;
}NODE;

NODE *head=NULL;
int N;
NODE *top;

void push(int data)
{
  if(isEmpty(head))
  {
    top=malloc(sizeof(NODE));
    top->data=data;
    top->next=NULL;
    head=top;
  }
  else
  {
  NODE *newNode=malloc(sizeof(NODE));

  newNode->data=data;
  newNode->next=NULL;

  top->next=newNode;

  top=newNode;
  }

}

int isEmpty(NODE *head)
{
  return head==NULL;
}

int printTop(NODE *top)
{
  return top->data;
}

void pop()
{
  int n=top->data;
  top=top-1;
  printf("%d\n",top->data);
}

void display(NODE *head)
{
  NODE *current=head;
  while(current!=NULL)
  {
    printf("%d->",current->data);
    current=current->next;
  }
}

int main()
{
  push(6);
  push(5);
  push(4);
  push(3);
  push(2);
  push(1);
  pop();
  //printf("%d\n",top->data);
  //top=pop(top);
  display(head);

}
